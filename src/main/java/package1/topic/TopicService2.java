package package1.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService2 {

	public List<Topic2> topics2 = new ArrayList<>(Arrays.asList(
			new Topic2("spring", "Spring Framework", "Spring Framework Description"),
			new Topic2("java", "Core Java", "Core Java Description"),
			new Topic2("js", "JS Framework", "JS Description"),
			new Topic2("python", "Python Framework", "Python Description")
			));
	
	public List<Topic2> getAllTopics(){
		return topics2;
	}
	
	public Topic2 getTopic(String id) {
		return topics2.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic2 topic) {
		topics2.add(topic);
		
	}

	public void updateTopic(String id, Topic2 topic) {
		for (int i=0; i<topics2.size(); i++) {
			Topic2 t = topics2.get(i);
			if(t.getId().equals(id)) {
				topics2.set(i,topic);
			}
		}
	}

	public void deleteTopic(String id) {
		topics2.removeIf(t->t.getId().equals(id));
		
	}
}
