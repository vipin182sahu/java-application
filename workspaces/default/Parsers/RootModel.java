import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String email;
	public String timezone;
	public String start_time;
	public String logo;
	public String state;
	public String description;
	public VersionModel _version;
	public String code_of_conduct;
	public String topic;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String background_image;
	public CreatorModel _creator;
	public int id;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String type;
	public String schedule_published_on;
	public String location_name;
	public String end_time;

	public RootModel(Call_for_papersModel call_for_papers, String organizer_name, String email, String timezone, String start_time, String logo, String state, String description, VersionModel version, String code_of_conduct, String topic, CopyrightModel copyright, String organizer_description, String background_image, CreatorModel creator, int id, String privacy, ArrayList<Social_linksModel> social_links, String name, String type, String schedule_published_on, String location_name, String end_time) {

		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.email = email;
		this.timezone = timezone;
		this.start_time = start_time;
		this.logo = logo;
		this.state = state;
		this.description = description;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this._creator = creator;
		this.id = id;
		this.privacy = privacy;
		this.social_links = social_links;
		this.name = name;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.end_time = end_time;

	}

}