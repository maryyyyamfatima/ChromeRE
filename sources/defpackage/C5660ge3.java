package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import java.util.ArrayList;
import java.util.List;
import org.chromium.chrome.browser.notifications.NotificationSettingsBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ge3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5660ge3 {
    public final InterfaceC7205l72 a;

    public C5660ge3(C7549m72 c7549m72) {
        this.a = c7549m72;
    }

    public final NotificationSettingsBridge.SiteChannel a(long j, String str, boolean z) {
        NotificationSettingsBridge.SiteChannel c = c(str);
        if (c != null) {
            return c;
        }
        NotificationChannelGroup a = ((QI) AbstractC10031tN.a.get("sites")).a(V60.a.getResources());
        C7549m72 c7549m72 = (C7549m72) this.a;
        c7549m72.c(a);
        NotificationSettingsBridge.SiteChannel siteChannel = new NotificationSettingsBridge.SiteChannel(!z ? 1 : 0, "web:" + C6751jo4.b(str).d() + ";" + j, str, j);
        c7549m72.b(siteChannel.a());
        return siteChannel;
    }

    public final NotificationSettingsBridge.SiteChannel c(String str) {
        String d = C6751jo4.b(str).d();
        for (NotificationSettingsBridge.SiteChannel siteChannel : d()) {
            if (siteChannel.getOrigin().equals(d)) {
                return siteChannel;
            }
        }
        return null;
    }

    public final NotificationSettingsBridge.SiteChannel[] d() {
        String id;
        String id2;
        String id3;
        int importance;
        List<NotificationChannel> e = ((C7549m72) this.a).e();
        ArrayList arrayList = new ArrayList();
        for (NotificationChannel notificationChannel : e) {
            id = notificationChannel.getId();
            if (e(id)) {
                id2 = notificationChannel.getId();
                String[] split = id2.substring(4).split(";");
                id3 = notificationChannel.getId();
                String str = split[0];
                long parseLong = Long.parseLong(split[1]);
                importance = notificationChannel.getImportance();
                arrayList.add(new NotificationSettingsBridge.SiteChannel(importance != 0 ? 0 : 1, id3, str, parseLong));
            }
        }
        return (NotificationSettingsBridge.SiteChannel[]) arrayList.toArray(new NotificationSettingsBridge.SiteChannel[arrayList.size()]);
    }

    public static boolean e(String str) {
        return str.startsWith("web:") && str.substring(4).contains(";");
    }

    public final String b(String str) {
        NotificationSettingsBridge.SiteChannel c = c(str);
        boolean z = c == null;
        if (z) {
            EI2.b("Notifications.Android.SitesChannel", true);
        }
        return z ? "sites" : c.getId();
    }
}
