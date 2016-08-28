import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public String topic;
	public CopyrightModel _copyright;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String organizer_name;
	public String location_name;
	public String privacy;
	public String description;
	public String code_of_conduct;
	public VersionModel _version;
	public String name;
	public String start_time;
	public int id;
	public CreatorModel _creator;
	public String state;
	public String type;
	public String background_image;
	public String email;
	public String organizer_description;
	public String end_time;

	public RootModel(Call_for_papersModel call_for_papers, String schedule_published_on, String topic, CopyrightModel copyright, String timezone, ArrayList<Social_linksModel> social_links, String logo, String organizer_name, String location_name, String privacy, String description, String code_of_conduct, VersionModel version, String name, String start_time, int id, CreatorModel creator, String state, String type, String background_image, String email, String organizer_description, String end_time) {

		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this._copyright = copyright;
		this.timezone = timezone;
		this.social_links = social_links;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.privacy = privacy;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.name = name;
		this.start_time = start_time;
		this.id = id;
		this._creator = creator;
		this.state = state;
		this.type = type;
		this.background_image = background_image;
		this.email = email;
		this.organizer_description = organizer_description;
		this.end_time = end_time;

	}

}