package dkrylov.petprojects.devschool.controller.delegate;

import dkrylov.petprojects.devschool.model.MentorDto;
import dkrylov.petprojects.devschool.model.SchoolDto;
import dkrylov.petprojects.devschool.service.CourseService;
import dkrylov.petprojects.devschool.api.ApiApiDelegate;
import dkrylov.petprojects.devschool.model.CourseDto;
import dkrylov.petprojects.devschool.service.MentorService;
import dkrylov.petprojects.devschool.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ControllerDelegate implements ApiApiDelegate {

    private final CourseService courseService;
    private final MentorService mentorService;
    private final SchoolService schoolService;

    /**
     * {@inheritDoc}
     */
    @Override
    public ResponseEntity<CourseDto> createCourse(CourseDto courseDto) {
        return new ResponseEntity<CourseDto>(courseService.create(courseDto), HttpStatus.CREATED);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResponseEntity<List<CourseDto>> getAllCourses() {
        return new ResponseEntity<List<CourseDto>>(courseService.search(), HttpStatus.OK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResponseEntity<CourseDto> getCourse(Long id) {
        return new ResponseEntity<CourseDto>(courseService.findById(id), HttpStatus.OK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResponseEntity<MentorDto> createMentor(MentorDto mentorDto) {
        return new ResponseEntity<MentorDto>(mentorService.create(mentorDto), HttpStatus.CREATED);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResponseEntity<List<MentorDto>> getAllMentors() {
        return new ResponseEntity<List<MentorDto>>(mentorService.search(), HttpStatus.OK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResponseEntity<MentorDto> getMentor(Long id) {
        return new ResponseEntity<MentorDto>(mentorService.findById(id), HttpStatus.OK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResponseEntity<SchoolDto> createSchool(SchoolDto schoolDto) {
        return new ResponseEntity<SchoolDto>(schoolService.create(schoolDto), HttpStatus.CREATED);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResponseEntity<List<SchoolDto>> getAllSchools() {
        return new ResponseEntity<List<SchoolDto>>(schoolService.search(), HttpStatus.OK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResponseEntity<SchoolDto> getSchool(Long id) {
        return new ResponseEntity<SchoolDto>(schoolService.findById(id), HttpStatus.OK);
    }
}