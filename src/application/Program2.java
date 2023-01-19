package application;

import db.DB;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.ArrayList;
import java.util.List;

public class Program2 {

    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TESTE 1: department findById ===");
        Department dep = departmentDao.findById(3);
        System.out.println(dep);

        System.out.println("\n=== TESTE 2: department findAll ===");
        List<Department> list = new ArrayList<>();
        list = departmentDao.findAll();
        for (Department c : list) {
            System.out.println(c);
        }

        System.out.println("\n=== TESTE 3: department delete ===");
        departmentDao.deleteById(6);
        System.out.println("Deleted!");

        System.out.println("\n=== TESTE 4: department update ===");
        dep = departmentDao.findById(4);
        dep.setName("Toys");
        departmentDao.update(dep);
        System.out.println("Update!");

        System.out.println("\n=== TESTE 5: department insert ===");
        Department dep2 = new Department(null, "Games");
        departmentDao.insert(dep2);
    }
}
