package io.javabrains.springbootstarter.co;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;



    public List<Course> getAllCourses(String topicId) {

        //return topics;
//        List<Course> courses= new ArrayList<>();
//        courseRepository.findAll()
//                .forEach(courses::add);
////        courseRepository.findByTopicId(topicId)
////                .forEach(courses::add);
//        return  courses;
        List<Course> courses= new ArrayList<>();
        courseRepository.findByTopicId(topicId)
        .forEach(courses::add);
        return  courses;

    }

    public Course getCourse(String id) {
        //return topics.stream().filter((Topic t) -> t.getId().equals(id)).findFirst().get();

        return courseRepository.findOne(id);
    }


    public void addCourse(Course topic) {
        //topics.add(topic);
        courseRepository.save(topic);
    }

    public void updateCOurse(Course course) {
//        for (int i = 0; i < topics.size(); i++) {
//            if (topic.getId().equals(id)) {
//                topics.set(i, topic);
//                return;
//            }
//
//        }

        courseRepository.save(course);

    }

    public void deleteCourse(String id) {
        //topics.removeIf(t -> t.getId().equals(id));
        courseRepository.delete(id);
    }


}

