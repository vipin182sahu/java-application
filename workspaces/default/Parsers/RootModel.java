import java.util.ArrayList;

class RootModel {

	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String start_time;
	public String organizer_description;
	public String location_name;
	public String schedule_published_on;
	public String topic;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String organizer_name;
	public String description;
	public int id;
	public String name;
	public String background_image;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String end_time;
	public String email;
	public String type;
	public VersionModel _version;
	public String state;

	public RootModel(String logo, ArrayList<Social_linksModel> social_links, String timezone, String start_time, String organizer_description, String location_name, String schedule_published_on, String topic, CopyrightModel copyright, CreatorModel creator, String organizer_name, String description, int id, String name, String background_image, String privacy, Call_for_papersModel call_for_papers, String code_of_conduct, String end_time, String email, String type, VersionModel version, String state) {

		this.logo = logo;
		this.social_links = social_links;
		this.timezone = timezone;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this._copyright = copyright;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.description = description;
		this.id = id;
		this.name = name;
		this.background_image = background_image;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.email = email;
		this.type = type;
		this._version = version;
		this.state = state;

	}

}