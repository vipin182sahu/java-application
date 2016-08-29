import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String background_image;
	public String schedule_published_on;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public int id;
	public CopyrightModel _copyright;
	public String logo;
	public String topic;
	public VersionModel _version;
	public String organizer_description;
	public String timezone;
	public String start_time;
	public String organizer_name;
	public String location_name;
	public String end_time;
	public String name;
	public String code_of_conduct;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public String type;

	public RootModel(CreatorModel creator, String background_image, String schedule_published_on, String email, ArrayList<Social_linksModel> social_links, String privacy, int id, CopyrightModel copyright, String logo, String topic, VersionModel version, String organizer_description, String timezone, String start_time, String organizer_name, String location_name, String end_time, String name, String code_of_conduct, String state, Call_for_papersModel call_for_papers, String description, String type) {

		this._creator = creator;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.social_links = social_links;
		this.privacy = privacy;
		this.id = id;
		this._copyright = copyright;
		this.logo = logo;
		this.topic = topic;
		this._version = version;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.end_time = end_time;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this.type = type;

	}

}