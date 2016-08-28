import java.util.ArrayList;

class RootModel {

	public int id;
	public String code_of_conduct;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String topic;
	public CopyrightModel _copyright;
	public String email;
	public String description;
	public String privacy;
	public VersionModel _version;
	public String type;
	public String end_time;
	public String start_time;
	public String organizer_description;
	public String state;
	public CreatorModel _creator;
	public String background_image;
	public String timezone;
	public String name;
	public String logo;

	public RootModel(int id, String code_of_conduct, String location_name, Call_for_papersModel call_for_papers, String organizer_name, ArrayList<Social_linksModel> social_links, String schedule_published_on, String topic, CopyrightModel copyright, String email, String description, String privacy, VersionModel version, String type, String end_time, String start_time, String organizer_description, String state, CreatorModel creator, String background_image, String timezone, String name, String logo) {

		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this._copyright = copyright;
		this.email = email;
		this.description = description;
		this.privacy = privacy;
		this._version = version;
		this.type = type;
		this.end_time = end_time;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.state = state;
		this._creator = creator;
		this.background_image = background_image;
		this.timezone = timezone;
		this.name = name;
		this.logo = logo;

	}

}