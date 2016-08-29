import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String description;
	public String code_of_conduct;
	public int id;
	public String background_image;
	public String type;
	public String timezone;
	public String location_name;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String state;
	public VersionModel _version;
	public String organizer_description;
	public String end_time;
	public CopyrightModel _copyright;
	public String start_time;
	public String organizer_name;
	public String privacy;
	public String schedule_published_on;
	public String email;
	public String logo;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(CreatorModel creator, String description, String code_of_conduct, int id, String background_image, String type, String timezone, String location_name, String name, Call_for_papersModel call_for_papers, String topic, String state, VersionModel version, String organizer_description, String end_time, CopyrightModel copyright, String start_time, String organizer_name, String privacy, String schedule_published_on, String email, String logo, ArrayList<Social_linksModel> social_links) {

		this._creator = creator;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.background_image = background_image;
		this.type = type;
		this.timezone = timezone;
		this.location_name = location_name;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.state = state;
		this._version = version;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this._copyright = copyright;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.logo = logo;
		this.social_links = social_links;

	}

}