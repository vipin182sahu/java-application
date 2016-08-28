import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String name;
	public CreatorModel _creator;
	public String description;
	public String code_of_conduct;
	public String timezone;
	public int id;
	public String topic;
	public String email;
	public String type;
	public String organizer_name;
	public String organizer_description;
	public String end_time;
	public String privacy;
	public String logo;
	public String start_time;
	public String schedule_published_on;
	public String state;

	public RootModel(ArrayList<Social_linksModel> social_links, VersionModel version, CopyrightModel copyright, String location_name, Call_for_papersModel call_for_papers, String background_image, String name, CreatorModel creator, String description, String code_of_conduct, String timezone, int id, String topic, String email, String type, String organizer_name, String organizer_description, String end_time, String privacy, String logo, String start_time, String schedule_published_on, String state) {

		this.social_links = social_links;
		this._version = version;
		this._copyright = copyright;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.name = name;
		this._creator = creator;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.id = id;
		this.topic = topic;
		this.email = email;
		this.type = type;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.privacy = privacy;
		this.logo = logo;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.state = state;

	}

}