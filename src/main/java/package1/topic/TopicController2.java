package package1.topic;

import java.util.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController2 {

	@Autowired
	private TopicService2 topicservice;
	
	@RequestMapping("/topics2")
	public List<Topic2> getAllTopics() {
		return topicservice.getAllTopics();
				
	}
	
	@RequestMapping("/topics2/{id}")
	public Topic2 getTopic(@PathVariable String id) {
		return topicservice.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics2")
	public void addTopic(@RequestBody Topic2 topic) {
		topicservice.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics2/{id}")
	public void updateTopic(@RequestBody Topic2 topic, @PathVariable String id ) {
		topicservice.updateTopic(id, topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics2/{id}")
	public void deleteTopic( @PathVariable String id ) {
		topicservice.deleteTopic(id);
	}
	
	
	//Spring boot automatically convert the return type to JSON object ie  array of objects
}
