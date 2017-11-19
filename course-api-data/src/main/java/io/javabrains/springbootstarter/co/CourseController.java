package io.javabrains.springbootstarter.co;


import io.javabrains.courseapidata.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/topics/{id}/courses")
    public List<Course> getAllCourses(@PathVariable String id) {
        System.out.println(id);

        return courseService.getAllCourses(id);


    }

    @RequestMapping("/topics/{topicId}/courses/{id}")
    public Course getCourse(@PathVariable String id) {
        return courseService.getCourse(id);

    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses")
    public void addCourse(@RequestBody Course course, @PathVariable String topicId) {
        course.setTopic(new Topic(topicId,"",""));
        courseService.addCourse(course);

    }


    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}/courses/{id}")
    public void updateTopic(@RequestBody Course course, @PathVariable String id ,@PathVariable String topicId) {
        course.setTopic(new Topic(topicId,"",""));
        courseService.updateCOurse(course);

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}/courses/{id}")
    public void deleteTopic(@RequestBody Course course, @PathVariable String id) {
        courseService.deleteCourse(id);
    }


}
