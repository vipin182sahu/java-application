import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String type;
	public String privacy;
	public String email;
	public String code_of_conduct;
	public String timezone;
	public String start_time;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String organizer_description;
	public String topic;
	public String location_name;
	public CopyrightModel _copyright;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public int id;
	public String end_time;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String description;
	public String state;

	public RootModel(VersionModel version, String type, String privacy, String email, String code_of_conduct, String timezone, String start_time, String schedule_published_on, CreatorModel creator, String organizer_description, String topic, String location_name, CopyrightModel copyright, String name, Call_for_papersModel call_for_papers, String organizer_name, int id, String end_time, String logo, ArrayList<Social_linksModel> social_links, String background_image, String description, String state) {

		this._version = version;
		this.type = type;
		this.privacy = privacy;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.location_name = location_name;
		this._copyright = copyright;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.id = id;
		this.end_time = end_time;
		this.logo = logo;
		this.social_links = social_links;
		this.background_image = background_image;
		this.description = description;
		this.state = state;

	}

}