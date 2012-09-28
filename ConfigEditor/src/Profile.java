import java.sql.*;

public class Profile
{
    public Profile()
    {
        newest  = true;
        changed = false;
        
        setToDefault();
    }
    
    public Profile(ResultSet rs) throws SQLException
    {
        newest  = false;
        changed = false;
        
        profile      = rs.getString("user");
        res_x        = rs.getInt("res_x");
        res_y        = rs.getInt("res_y");
        size_x       = rs.getInt("size_x");
        size_y       = rs.getInt("size_y");
        sound_volume = rs.getInt("sound_volume");
        music_volume = rs.getInt("music_volume");
        sound        = rs.getString("sound").equals("T");
        music        = rs.getString("music").equals("T");
        fullscreen   = rs.getString("fullscreen").equals("T");
        vsync        = rs.getString("vsync").equals("T");
        id           = rs.getLong("id");
    }
    
    final public void setToDefault()
    {
        profile      = "new_user";
        res_x        = 1024;
        res_y        = 768;
        size_x       = 800;
        size_y       = 600;
        sound_volume = 50;
        music_volume = 50;
        sound        = true;
        music        = true;
        fullscreen   = false;
        vsync        = false;
    }
    
    public void Save(DataBase db) throws SQLException
    {
        // Мои первые SQL строки
        String i = String.format("INSERT INTO options VALUES(NULL, '%s', %d, %d, '%c', '%c', %d, %d, %d, %d, '%c', '%c');",
                   profile, res_x, res_y, fullscreen ? 'T' : 'F', vsync ? 'T' : 'F', getSize_x(), getSize_y(), 
                   sound_volume, music_volume, sound ? 'T' : 'F', music ? 'T' : 'F');
        
        String r = "SELECT id FROM options WHERE id = last_insert_rowid();";
        
        String u = String.format("UPDATE options SET user='%s', res_x=%d, res_y=%d, size_x=%d, size_y=%d, sound_volume=%d,"
                   + "music_volume=%d, sound='%c', music='%c', fullscreen='%c', vsync='%c' WHERE id=%d;", profile, res_x, res_y,
                   size_x, size_y, sound_volume, music_volume, sound ? 'T' : 'F', music ? 'T' : 'F',
                   fullscreen ? 'T' : 'F', vsync ? 'T' : 'F', id);

        if(newest)
        {
            db.RunPureSQLCommand(i);
            ResultSet rs = db.RunSQLCommand(r);
            while(rs.next())
            {
                id = rs.getInt("id");
            }
            
            newest  = false;
            changed = false;
        }
        else if(changed)
        {
            db.RunPureSQLCommand(u);
            
            changed = false;
            newest  = false;
        }
    }
    
    public boolean howAreYou()
    {
        return newest || changed;
    }
    
    public void Delete(DataBase db)
    {
        String del_sql = "DELETE FROM options WHERE id = " + id + ";";
        
        //s.execute(del_sql);
        db.RunPureSQLCommand(del_sql);
    }
    
    @Override
    public String toString()
    {
        return profile;
    }

    public String getProfile()
    {
        return profile;
    }

    public void setProfile(String profile)
    {
        this.changed = true;
        this.profile = profile;
    }

    public int getRes_x()
    {
        return res_x;
    }

    public void setRes_x(int res_x)
    {
        if(this.res_x != res_x)
        {
            this.changed = true;
            this.res_x   = res_x;
        }
    }

    public int getRes_y()
    {
        return res_y;
    }

    public void setRes_y(int res_y)
    {
        if(this.res_y != res_y)
        {
            this.changed = true;
            this.res_y   = res_y;
        }
    }

    public int getSound_volume()
    {
        return sound_volume;
    }

    public void setSound_volume(int sound_volume)
    {
        if(this.sound_volume != sound_volume)
        {
            this.changed      = true;
            this.sound_volume = sound_volume;
        }
    }

    public int getMusic_volume()
    {
        return music_volume;
    }

    public void setMusic_volume(int music_volume)
    {
        if(this.music_volume != music_volume)
        {
            this.changed      = true;
            this.music_volume = music_volume;
        }
    }

    public boolean isSound()
    {
        return sound;
    }

    public void setSound(boolean sound)
    {
        if(this.sound != sound)
        {
            this.changed = true;
            this.sound   = sound;
        }
    }

    public boolean isMusic()
    {
        return music;
    }

    public void setMusic(boolean music)
    {
        if(this.music != music)
        {
            this.changed = true;
            this.music   = music;
        }
    }

    public boolean isFullscreen()
    {
        return fullscreen;
    }

    public void setFullscreen(boolean fullscreen)
    {
        if(this.fullscreen != fullscreen)
        {
            this.changed    = true;
            this.fullscreen = fullscreen;
        }
    }

    public boolean isVsync()
    {
        return vsync;
    }

    public void setVsync(boolean vsync)
    {
        if(this.vsync != vsync)
        {
            this.changed = true;
            this.vsync   = vsync;
        }
    }
    
    public int getSize_x()
    {
        return size_x;
    }

    public void setSize_x(int size_x)
    {
        this.size_x = size_x;
    }

    public int getSize_y()
    {
        return size_y;
    }

    public void setSize_y(int size_y)
    {
        this.size_y = size_y;
    }
    
    boolean changed = false;
    boolean newest  = false;
    
    private String  profile;
    private int     res_x;
    private int     res_y;
    private int     size_x;
    private int     size_y;
    private int     sound_volume;
    private int     music_volume;
    private boolean sound;
    private boolean music;
    private boolean fullscreen;
    private boolean vsync;
    private long    id;  
}
