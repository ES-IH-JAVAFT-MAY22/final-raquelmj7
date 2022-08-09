export class Games {

    constructor(
      private _id: number,
      private _name: string,
      private _description: string,
      private _image: string,
      private _season: string,
      private _type: string,
        
    ) { }

    public get type(): string {
        return this._type;
    }
    public set type(value: string) {
        this._type = value;
    }
    public get season(): string {
        return this._season;
    }
    public set season(value: string) {
        this._season = value;
    }
    public get image(): string {
        return this._image;
    }
    public set image(value: string) {
        this._image = value;
    }
    public get description(): string {
        return this._description;
    }
    public set description(value: string) {
        this._description = value;
    }
    public get name(): string {
        return this._name;
    }
    public set name(value: string) {
        this._name = value;
    }
    public get id(): number {
        return this._id;
    }
    public set id(value: number) {
        this._id = value;
    }

}