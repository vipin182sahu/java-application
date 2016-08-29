import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String logo;
	public String description;
	public String schedule_published_on;
	public String type;
	public int id;
	public String organizer_description;
	public String start_time;
	public String code_of_conduct;
	public String timezone;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String email;
	public CopyrightModel _copyright;
	public String name;
	public String organizer_name;
	public String state;
	public String topic;
	public String end_time;
	public String location_name;
	public VersionModel _version;

	public RootModel(Call_for_papersModel call_for_papers, String privacy, String logo, String description, String schedule_published_on, String type, int id, String organizer_description, String start_time, String code_of_conduct, String timezone, CreatorModel creator, ArrayList<Social_linksModel> social_links, String background_image, String email, CopyrightModel copyright, String name, String organizer_name, String state, String topic, String end_time, String location_name, VersionModel version) {

		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.logo = logo;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.id = id;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this._creator = creator;
		this.social_links = social_links;
		this.background_image = background_image;
		this.email = email;
		this._copyright = copyright;
		this.name = name;
		this.organizer_name = organizer_name;
		this.state = state;
		this.topic = topic;
		this.end_time = end_time;
		this.location_name = location_name;
		this._version = version;

	}

}