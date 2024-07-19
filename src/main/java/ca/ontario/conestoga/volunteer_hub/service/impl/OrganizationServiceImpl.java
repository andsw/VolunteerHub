package ca.ontario.conestoga.volunteer_hub.service.impl;

import ca.ontario.conestoga.volunteer_hub.entity.Organization;
import ca.ontario.conestoga.volunteer_hub.entity.OrganizationExample;
import ca.ontario.conestoga.volunteer_hub.mapper.OrganizationMapper;
import ca.ontario.conestoga.volunteer_hub.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizationServiceImpl implements OrganizationService {

  private final OrganizationMapper organizationMapper;

  @Autowired
  public OrganizationServiceImpl(OrganizationMapper organizationMapper) {
    this.organizationMapper = organizationMapper;
  }

  @Override
  public Organization getOrganizationById(Integer id) {
    return organizationMapper.selectByPrimaryKey(id);
  }

  @Override
  public List<Organization> getAllOrganizations() {
    OrganizationExample example = new OrganizationExample();
    return organizationMapper.selectByExample(example);
  }

  @Override
  public void saveOrganization(Organization organization) {
    organizationMapper.insertSelective(organization);
  }

  @Override
  public void updateOrganization(Organization organization) {
    organizationMapper.updateByPrimaryKeySelective(organization);
  }

  @Override
  public void deleteOrganization(Integer id) {
    organizationMapper.deleteByPrimaryKey(id);
  }
}
