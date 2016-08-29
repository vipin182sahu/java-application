import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String end_time;
	public String code_of_conduct;
	public String location_name;
	public VersionModel _version;
	public String timezone;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String name;
	public String topic;
	public String start_time;
	public CopyrightModel _copyright;
	public String type;
	public String background_image;
	public String schedule_published_on;
	public String description;
	public String state;
	public CreatorModel _creator;
	public String email;
	public String privacy;
	public int id;

	public RootModel(Call_for_papersModel call_for_papers, String organizer_name, String end_time, String code_of_conduct, String location_name, VersionModel version, String timezone, String organizer_description, ArrayList<Social_linksModel> social_links, String logo, String name, String topic, String start_time, CopyrightModel copyright, String type, String background_image, String schedule_published_on, String description, String state, CreatorModel creator, String email, String privacy, int id) {

		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this._version = version;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.logo = logo;
		this.name = name;
		this.topic = topic;
		this.start_time = start_time;
		this._copyright = copyright;
		this.type = type;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.state = state;
		this._creator = creator;
		this.email = email;
		this.privacy = privacy;
		this.id = id;

	}

}