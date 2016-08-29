import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String timezone;
	public String logo;
	public String start_time;
	public String name;
	public String state;
	public String privacy;
	public int id;
	public String topic;
	public String background_image;
	public String type;
	public String email;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String description;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String organizer_name;
	public String end_time;
	public String location_name;

	public RootModel(Call_for_papersModel call_for_papers, String schedule_published_on, ArrayList<Social_linksModel> social_links, VersionModel version, String timezone, String logo, String start_time, String name, String state, String privacy, int id, String topic, String background_image, String type, String email, String code_of_conduct, CreatorModel creator, String description, CopyrightModel copyright, String organizer_description, String organizer_name, String end_time, String location_name) {

		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this._version = version;
		this.timezone = timezone;
		this.logo = logo;
		this.start_time = start_time;
		this.name = name;
		this.state = state;
		this.privacy = privacy;
		this.id = id;
		this.topic = topic;
		this.background_image = background_image;
		this.type = type;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.description = description;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.location_name = location_name;

	}

}