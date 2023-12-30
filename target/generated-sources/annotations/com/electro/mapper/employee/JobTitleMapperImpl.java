package com.electro.mapper.employee;

import com.electro.dto.employee.JobTitleRequest;
import com.electro.dto.employee.JobTitleResponse;
import com.electro.entity.employee.JobTitle;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-30T22:27:34+0700",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class JobTitleMapperImpl implements JobTitleMapper {

    @Override
    public JobTitle requestToEntity(JobTitleRequest request) {
        if ( request == null ) {
            return null;
        }

        JobTitle jobTitle = new JobTitle();

        jobTitle.setName( request.getName() );
        jobTitle.setStatus( request.getStatus() );

        return jobTitle;
    }

    @Override
    public JobTitleResponse entityToResponse(JobTitle entity) {
        if ( entity == null ) {
            return null;
        }

        JobTitleResponse jobTitleResponse = new JobTitleResponse();

        jobTitleResponse.setId( entity.getId() );
        jobTitleResponse.setCreatedAt( entity.getCreatedAt() );
        jobTitleResponse.setUpdatedAt( entity.getUpdatedAt() );
        jobTitleResponse.setName( entity.getName() );
        jobTitleResponse.setStatus( entity.getStatus() );

        return jobTitleResponse;
    }

    @Override
    public List<JobTitle> requestToEntity(List<JobTitleRequest> requests) {
        if ( requests == null ) {
            return null;
        }

        List<JobTitle> list = new ArrayList<JobTitle>( requests.size() );
        for ( JobTitleRequest jobTitleRequest : requests ) {
            list.add( requestToEntity( jobTitleRequest ) );
        }

        return list;
    }

    @Override
    public List<JobTitleResponse> entityToResponse(List<JobTitle> entities) {
        if ( entities == null ) {
            return null;
        }

        List<JobTitleResponse> list = new ArrayList<JobTitleResponse>( entities.size() );
        for ( JobTitle jobTitle : entities ) {
            list.add( entityToResponse( jobTitle ) );
        }

        return list;
    }

    @Override
    public JobTitle partialUpdate(JobTitle entity, JobTitleRequest request) {
        if ( request == null ) {
            return null;
        }

        entity.setName( request.getName() );
        entity.setStatus( request.getStatus() );

        return entity;
    }
}
