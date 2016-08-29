import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String location_name;
	public String schedule_published_on;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String type;
	public String start_time;
	public String name;
	public String email;
	public String code_of_conduct;
	public String organizer_description;
	public CreatorModel _creator;
	public String background_image;
	public String timezone;
	public String topic;
	public String privacy;
	public String description;
	public VersionModel _version;
	public String state;
	public String logo;
	public int id;

	public RootModel(Call_for_papersModel call_for_papers, String organizer_name, String location_name, String schedule_published_on, String end_time, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String type, String start_time, String name, String email, String code_of_conduct, String organizer_description, CreatorModel creator, String background_image, String timezone, String topic, String privacy, String description, VersionModel version, String state, String logo, int id) {

		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.social_links = social_links;
		this._copyright = copyright;
		this.type = type;
		this.start_time = start_time;
		this.name = name;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.background_image = background_image;
		this.timezone = timezone;
		this.topic = topic;
		this.privacy = privacy;
		this.description = description;
		this._version = version;
		this.state = state;
		this.logo = logo;
		this.id = id;

	}

}