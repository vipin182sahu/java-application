import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String start_time;
	public String timezone;
	public String logo;
	public String topic;
	public String location_name;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String organizer_description;
	public VersionModel _version;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String organizer_name;
	public String name;
	public int id;
	public String background_image;
	public String end_time;
	public String description;
	public String state;
	public CreatorModel _creator;
	public String type;

	public RootModel(Call_for_papersModel call_for_papers, String code_of_conduct, String start_time, String timezone, String logo, String topic, String location_name, CopyrightModel copyright, String schedule_published_on, String organizer_description, VersionModel version, String email, ArrayList<Social_linksModel> social_links, String privacy, String organizer_name, String name, int id, String background_image, String end_time, String description, String state, CreatorModel creator, String type) {

		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.timezone = timezone;
		this.logo = logo;
		this.topic = topic;
		this.location_name = location_name;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this._version = version;
		this.email = email;
		this.social_links = social_links;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.name = name;
		this.id = id;
		this.background_image = background_image;
		this.end_time = end_time;
		this.description = description;
		this.state = state;
		this._creator = creator;
		this.type = type;

	}

}