package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class ProgramDepartment {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		System.out.println("== TESTE 1: Department FindByID ==");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		System.out.println("== \n\nTESTE 2: Department findByAll ==");
		List<Department> list = departmentDao.findAll();
		for(Department obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("== \n\nTESTE 3: Department Insert ==");
		Department newDep = new Department(null, "Deposito");
		departmentDao.insert(newDep);
		System.out.println("Inserted! new id = " + newDep.getId());
		
		System.out.println("== \n\nTESTE 4: Department Update ==");
		dep = departmentDao.findById(7);
		dep.setName("Estoque");
		departmentDao.update(dep);
		System.out.println("Updated completed");
		
		System.out.println("== \n\nTESTE 5: Department Delete ==");
		departmentDao.daleteById(9);
		System.out.println("Deleted");
		sc.close();
	}

}
