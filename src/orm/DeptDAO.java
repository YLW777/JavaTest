package orm;

import java.util.List;

public interface DeptDAO {
	
	void save(Dept dept);
	void update(Dept dept);
	void delete(Integer deptno);
	
	Dept findByDeptno(Integer deptno); //查詢 回傳 一筆 部門資料
	List<Dept> getAll(); //適用 多筆 資料查詢
	
}
