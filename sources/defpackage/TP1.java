package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class TP1 {
    public final Bundle a;
    public List b;
    public List c;

    public TP1(Bundle bundle) {
        this.a = bundle;
    }

    public final String d() {
        return this.a.getString("id");
    }

    public final List b() {
        if (this.b == null) {
            ArrayList<String> stringArrayList = this.a.getStringArrayList("groupMemberIds");
            this.b = stringArrayList;
            if (stringArrayList == null) {
                this.b = Collections.emptyList();
            }
        }
        return this.b;
    }

    public final Uri c() {
        String string = this.a.getString("iconUri");
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final void a() {
        if (this.c == null) {
            ArrayList parcelableArrayList = this.a.getParcelableArrayList("controlFilters");
            this.c = parcelableArrayList;
            if (parcelableArrayList == null) {
                this.c = Collections.emptyList();
            }
        }
    }

    public final boolean e() {
        a();
        return (TextUtils.isEmpty(d()) || TextUtils.isEmpty(this.a.getString("name")) || this.c.contains(null)) ? false : true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaRouteDescriptor{ id=");
        sb.append(d());
        sb.append(", groupMemberIds=");
        sb.append(b());
        sb.append(", name=");
        Bundle bundle = this.a;
        sb.append(bundle.getString("name"));
        sb.append(", description=");
        sb.append(bundle.getString("status"));
        sb.append(", iconUri=");
        sb.append(c());
        sb.append(", isEnabled=");
        sb.append(bundle.getBoolean("enabled", true));
        sb.append(", connectionState=");
        sb.append(bundle.getInt("connectionState", 0));
        sb.append(", controlFilters=");
        a();
        sb.append(Arrays.toString(this.c.toArray()));
        sb.append(", playbackType=");
        sb.append(bundle.getInt("playbackType", 1));
        sb.append(", playbackStream=");
        sb.append(bundle.getInt("playbackStream", -1));
        sb.append(", deviceType=");
        sb.append(bundle.getInt("deviceType"));
        sb.append(", volume=");
        sb.append(bundle.getInt("volume"));
        sb.append(", volumeMax=");
        sb.append(bundle.getInt("volumeMax"));
        sb.append(", volumeHandling=");
        sb.append(bundle.getInt("volumeHandling", 0));
        sb.append(", presentationDisplayId=");
        sb.append(bundle.getInt("presentationDisplayId", -1));
        sb.append(", extras=");
        sb.append(bundle.getBundle("extras"));
        sb.append(", isValid=");
        sb.append(e());
        sb.append(", minClientVersion=");
        sb.append(bundle.getInt("minClientVersion", 1));
        sb.append(", maxClientVersion=");
        sb.append(bundle.getInt("maxClientVersion", Integer.MAX_VALUE));
        sb.append(" }");
        return sb.toString();
    }
}
