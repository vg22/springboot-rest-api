package io.javabrains.springbootstarter.co;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {

    //getall topics
    //gteall

    public List<Course> findByTopicId(String topicId);





}
