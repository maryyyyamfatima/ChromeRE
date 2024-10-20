package defpackage;

import android.media.MediaRoute2Info;
import android.media.RouteDiscoveryPreference;
import android.media.RouteDiscoveryPreference$Builder;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class LQ1 {
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x004d. Please report as an issue. */
    public static RouteDiscoveryPreference b(WP1 wp1) {
        wp1.a();
        wp1.b.a();
        if (!(!r0.b.contains(null))) {
            return new RouteDiscoveryPreference$Builder(new ArrayList(), false).build();
        }
        boolean b = wp1.b();
        ArrayList arrayList = new ArrayList();
        wp1.a();
        Iterator it = wp1.b.c().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            str.getClass();
            char c = 65535;
            switch (str.hashCode()) {
                case -2065577523:
                    if (str.equals("android.media.intent.category.REMOTE_PLAYBACK")) {
                        c = 0;
                        break;
                    }
                    break;
                case 956939050:
                    if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
                        c = 1;
                        break;
                    }
                    break;
                case 975975375:
                    if (str.equals("android.media.intent.category.LIVE_VIDEO")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    str = "android.media.route.feature.REMOTE_PLAYBACK";
                    break;
                case 1:
                    str = "android.media.route.feature.LIVE_AUDIO";
                    break;
                case 2:
                    str = "android.media.route.feature.LIVE_VIDEO";
                    break;
            }
            arrayList.add(str);
        }
        return new RouteDiscoveryPreference$Builder(arrayList, b).build();
    }

    public static TP1 c(MediaRoute2Info mediaRoute2Info) {
        String id;
        CharSequence name;
        int connectionState;
        int volumeHandling;
        int volumeMax;
        int volume;
        Bundle extras;
        CharSequence description;
        Uri iconUri;
        Bundle extras2;
        if (mediaRoute2Info == null) {
            return null;
        }
        id = mediaRoute2Info.getId();
        name = mediaRoute2Info.getName();
        SP1 sp1 = new SP1(id, name.toString());
        connectionState = mediaRoute2Info.getConnectionState();
        Bundle bundle = sp1.a;
        bundle.putInt("connectionState", connectionState);
        volumeHandling = mediaRoute2Info.getVolumeHandling();
        bundle.putInt("volumeHandling", volumeHandling);
        volumeMax = mediaRoute2Info.getVolumeMax();
        bundle.putInt("volumeMax", volumeMax);
        volume = mediaRoute2Info.getVolume();
        bundle.putInt("volume", volume);
        extras = mediaRoute2Info.getExtras();
        if (extras == null) {
            bundle.putBundle("extras", null);
        } else {
            bundle.putBundle("extras", new Bundle(extras));
        }
        bundle.putBoolean("enabled", true);
        bundle.putBoolean("canDisconnect", false);
        description = mediaRoute2Info.getDescription();
        if (description != null) {
            bundle.putString("status", description.toString());
        }
        iconUri = mediaRoute2Info.getIconUri();
        if (iconUri != null) {
            bundle.putString("iconUri", iconUri.toString());
        }
        extras2 = mediaRoute2Info.getExtras();
        if (extras2 == null || !extras2.containsKey("androidx.mediarouter.media.KEY_EXTRAS") || !extras2.containsKey("androidx.mediarouter.media.KEY_DEVICE_TYPE") || !extras2.containsKey("androidx.mediarouter.media.KEY_CONTROL_FILTERS")) {
            return null;
        }
        Bundle bundle2 = extras2.getBundle("androidx.mediarouter.media.KEY_EXTRAS");
        if (bundle2 == null) {
            bundle.putBundle("extras", null);
        } else {
            bundle.putBundle("extras", new Bundle(bundle2));
        }
        bundle.putInt("deviceType", extras2.getInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", 0));
        bundle.putInt("playbackType", extras2.getInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", 1));
        ArrayList parcelableArrayList = extras2.getParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS");
        if (parcelableArrayList != null) {
            sp1.a(parcelableArrayList);
        }
        return sp1.b();
    }

    public static ArrayList a(List list) {
        String id;
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2Info = (MediaRoute2Info) it.next();
            if (mediaRoute2Info != null) {
                id = mediaRoute2Info.getId();
                arrayList.add(id);
            }
        }
        return arrayList;
    }
}
