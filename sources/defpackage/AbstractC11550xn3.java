package defpackage;

import android.content.Context;
import android.text.format.DateUtils;
import com.android.chrome.R;
import java.util.Calendar;
import java.util.Date;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xn3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC11550xn3 {
    public static StringBuilder a(Date date) {
        Context context = V60.a;
        Calendar calendar = AbstractC11207wn3.a;
        calendar.setTimeInMillis(System.currentTimeMillis());
        Calendar calendar2 = AbstractC11207wn3.b;
        calendar2.setTime(date);
        StringBuilder sb = new StringBuilder();
        if (WE.b(calendar, calendar2)) {
            sb.append(context.getString(R.string.f89130_resource_name_obfuscated_res_0x7f140b35));
            sb.append(" - ");
        } else {
            calendar.add(5, -1);
            if (WE.b(calendar, calendar2)) {
                sb.append(context.getString(R.string.f91800_resource_name_obfuscated_res_0x7f140c59));
                sb.append(" - ");
            }
        }
        sb.append(DateUtils.formatDateTime(context, date.getTime(), 98308));
        return sb;
    }
}
