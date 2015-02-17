package com.imcode.services.impl;

import com.imcode.entities.Role;
import com.imcode.repositories.RoleRepository;
import com.imcode.services.AbstractService;
import com.imcode.services.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceRepoImpl extends AbstractService<Role, Long, RoleRepository> implements RoleService{

//    @Autowired
//    private RoleRepository repo;
//
//    @Override
//    public Role save(Role entity) {
//        return repo.saveAndFlush(entity);
//    }
//
//    @Override
//    public Role find(Long id) {
//        return repo.findOne(id);
//    }
//
//    @Override
//    public boolean exist(Long id) {
//        return repo.exists(id);
//    }
//
//    @Override
//    public void delete(Long id) {
//        repo.delete(id);
//    }
//
//    @Override
//    public List<Role> findAll() {
//        return repo.findAll();
//    }
//
//    public RoleRepository getRepo() {
//        return repo;
//    }
//
//    public void setRepo(RoleRepository repo) {
//        this.repo = repo;
//    }
}
