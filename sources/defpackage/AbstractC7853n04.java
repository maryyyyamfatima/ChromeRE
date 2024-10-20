package defpackage;

import android.content.Context;
import android.text.format.DateUtils;
import android.text.format.Formatter;
import com.android.chrome.R;
import java.util.Calendar;
import java.util.Date;
import org.chromium.components.offline_items_collection.OfflineItem;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: n04, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7853n04 {
    public static final /* synthetic */ int a = 0;

    static {
        UE.b();
    }

    public static String a(OfflineItem offlineItem) {
        Context context = V60.a;
        String b = AbstractC10615v34.b(1, offlineItem.x);
        long j = offlineItem.p;
        if (j == 0) {
            return context.getString(R.string.f72610_resource_name_obfuscated_res_0x7f14042b, b);
        }
        return context.getString(R.string.f72600_resource_name_obfuscated_res_0x7f14042a, Formatter.formatFileSize(context, j), b);
    }

    public static String b(OfflineItem offlineItem) {
        Context context = V60.a;
        return context.getString(R.string.f72660_resource_name_obfuscated_res_0x7f140431, AbstractC10615v34.b(1, offlineItem.x), Formatter.formatFileSize(context, offlineItem.p));
    }

    public static String c(Date date) {
        Context context = V60.a;
        Calendar a2 = UE.a();
        Calendar a3 = UE.a();
        a2.setTimeInMillis(System.currentTimeMillis());
        a3.setTime(date);
        if (WE.b(a2, a3)) {
            int d = (int) JM1.d((a2.getTimeInMillis() - a3.getTimeInMillis()) / 3600000, 1L, 23L);
            return context.getResources().getQuantityString(R.plurals.f62390_resource_name_obfuscated_res_0x7f120011, d, Integer.valueOf(d));
        }
        return DateUtils.formatDateTime(context, date.getTime(), 4);
    }
}
