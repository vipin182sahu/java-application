import java.util.ArrayList;

class RootModel {

	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String description;
	public String organizer_name;
	public String code_of_conduct;
	public String background_image;
	public VersionModel _version;
	public String organizer_description;
	public CopyrightModel _copyright;
	public String topic;
	public String name;
	public String email;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String location_name;
	public int id;
	public String start_time;
	public String type;
	public String logo;
	public String schedule_published_on;
	public String state;

	public RootModel(String end_time, Call_for_papersModel call_for_papers, String timezone, String description, String organizer_name, String code_of_conduct, String background_image, VersionModel version, String organizer_description, CopyrightModel copyright, String topic, String name, String email, CreatorModel creator, ArrayList<Social_linksModel> social_links, String privacy, String location_name, int id, String start_time, String type, String logo, String schedule_published_on, String state) {

		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.description = description;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this._version = version;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.topic = topic;
		this.name = name;
		this.email = email;
		this._creator = creator;
		this.social_links = social_links;
		this.privacy = privacy;
		this.location_name = location_name;
		this.id = id;
		this.start_time = start_time;
		this.type = type;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.state = state;

	}

}