package {{cookiecutter.package}}.service;

import {{cookiecutter.package}}.dao.{{cookiecutter.module}}Repository;
import {{cookiecutter.package}}.model.{{cookiecutter.module}};
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author evan
 * create-date 2018/7/25
 */
@Service
public class {{cookiecutter.module}}Service {

    private static final Logger logger = LoggerFactory.getLogger({{cookiecutter.module}}Service.class);

    @Autowired
    private {{cookiecutter.module}}Repository {{cookiecutter.module|lower}}Repository;

    @Transactional
    public {{cookiecutter.module}} save{{cookiecutter.module}}({{cookiecutter.module}} {{cookiecutter.module|lower}}){
        {{cookiecutter.module}} find = {{cookiecutter.module|lower}}Repository.findBy{{cookiecutter.module}}Id({{cookiecutter.module|lower}}.get{{cookiecutter.module}}Id());
        if (null == find){
            find = {{cookiecutter.module|lower}}Repository.save({{cookiecutter.module|lower}});
        }else {
            //find.setName({{cookiecutter.module|lower}}.getName());
            find = {{cookiecutter.module|lower}}Repository.save({{cookiecutter.module|lower}});
        }
        return find;
    }

    public {{cookiecutter.module}} read{{cookiecutter.module}}(Long {{cookiecutter.module|lower}}Id){
        return {{cookiecutter.module|lower}}Repository.findBy{{cookiecutter.module}}Id({{cookiecutter.module|lower}}Id);
    }

    /**
     *
     * @param {{cookiecutter.module|lower}}Id
     * @return
     */
    public {{cookiecutter.module}} delete{{cookiecutter.module}}(Long {{cookiecutter.module|lower}}Id){
        {{cookiecutter.module}} find = {{cookiecutter.module|lower}}Repository.findBy{{cookiecutter.module}}Id({{cookiecutter.module|lower}}Id);
        if (null != find){
            {{cookiecutter.module|lower}}Repository.delete(find);
        }
        return find;
    }
}
