import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public int id;
	public String end_time;
	public String location_name;
	public CreatorModel _creator;
	public String name;
	public String privacy;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String background_image;
	public String topic;
	public String email;
	public String code_of_conduct;
	public String timezone;
	public String description;
	public String logo;
	public String start_time;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String state;

	public RootModel(VersionModel version, int id, String end_time, String location_name, CreatorModel creator, String name, String privacy, String organizer_name, CopyrightModel copyright, String background_image, String topic, String email, String code_of_conduct, String timezone, String description, String logo, String start_time, String schedule_published_on, Call_for_papersModel call_for_papers, String type, ArrayList<Social_linksModel> social_links, String organizer_description, String state) {

		this._version = version;
		this.id = id;
		this.end_time = end_time;
		this.location_name = location_name;
		this._creator = creator;
		this.name = name;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.background_image = background_image;
		this.topic = topic;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.description = description;
		this.logo = logo;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.state = state;

	}

}