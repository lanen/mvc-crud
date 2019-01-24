package {{cookiecutter.package}}.dao;

import {{cookiecutter.package}}.model.{{cookiecutter.module}};
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author evan
 * @date 2019-01-23
 */
@Repository
public interface {{cookiecutter.module}}Repository extends CrudRepository<{{cookiecutter.module}}, Integer> {

    {{cookiecutter.module}} findBy{{cookiecutter.module}}Id(Long {{cookiecutter.module|lower}}Id);
}

