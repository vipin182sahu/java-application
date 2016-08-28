import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String email;
	public CopyrightModel _copyright;
	public String name;
	public String end_time;
	public String location_name;
	public String topic;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String description;
	public VersionModel _version;
	public String start_time;
	public String schedule_published_on;
	public String logo;
	public String privacy;
	public String timezone;
	public String type;
	public int id;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String state;

	public RootModel(String organizer_description, String email, CopyrightModel copyright, String name, String end_time, String location_name, String topic, String background_image, ArrayList<Social_linksModel> social_links, String code_of_conduct, CreatorModel creator, String description, VersionModel version, String start_time, String schedule_published_on, String logo, String privacy, String timezone, String type, int id, String organizer_name, Call_for_papersModel call_for_papers, String state) {

		this.organizer_description = organizer_description;
		this.email = email;
		this._copyright = copyright;
		this.name = name;
		this.end_time = end_time;
		this.location_name = location_name;
		this.topic = topic;
		this.background_image = background_image;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.description = description;
		this._version = version;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.privacy = privacy;
		this.timezone = timezone;
		this.type = type;
		this.id = id;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.state = state;

	}

}