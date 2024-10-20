package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.Size;
import android.widget.RemoteViews;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class IG2 {
    public final ComponentName a;
    public final Intent b;
    public final Intent c;
    public final HG2 d;
    public final HG2 e;
    public final HG2 f;
    public final HG2 g;

    public static void a(RemoteViews remoteViews, C9751sZ2 c9751sZ2, HG2 hg2, int i) {
        boolean z;
        boolean z2 = c9751sZ2.c;
        int max = (int) Math.max(0.0d, Math.ceil(((hg2.b - i) * 1.0d) / hg2.d));
        int i2 = !z2 ? 1 : 0;
        boolean z3 = c9751sZ2.e;
        int i3 = i2 + (!z3 ? 1 : 0);
        boolean z4 = c9751sZ2.d;
        int i4 = i3 + (!z4 ? 1 : 0) + 0;
        if (max > i4) {
            i4++;
            z = false;
        } else {
            z = true;
        }
        if (max > i4 && z4) {
            i4++;
            z4 = false;
        }
        if (max > i4 && z3) {
            i4++;
            z3 = false;
        }
        if (max > i4 && z2) {
            z2 = false;
        }
        remoteViews.setViewVisibility(R.id.voice_search_quick_action_button, z2 ? 0 : 8);
        remoteViews.setViewVisibility(R.id.incognito_quick_action_button, z3 ? 0 : 8);
        remoteViews.setViewVisibility(R.id.lens_quick_action_button, z4 ? 0 : 8);
        remoteViews.setViewVisibility(R.id.dino_quick_action_button, z ? 0 : 8);
    }

    public IG2(Context context, ComponentName componentName, Intent intent, Intent intent2) {
        this.a = componentName;
        this.b = intent;
        this.c = intent2;
        Context applicationContext = context.getApplicationContext();
        this.d = new HG2(applicationContext, R.layout.f60240_resource_name_obfuscated_res_0x7f0e023a, R.dimen.f39230_resource_name_obfuscated_res_0x7f0806c6, R.dimen.f39150_resource_name_obfuscated_res_0x7f0806be, R.dimen.f39140_resource_name_obfuscated_res_0x7f0806bd, R.dimen.f39110_resource_name_obfuscated_res_0x7f0806ba);
        this.e = new HG2(applicationContext, R.layout.f60250_resource_name_obfuscated_res_0x7f0e023b, R.dimen.f39360_resource_name_obfuscated_res_0x7f0806d3, R.dimen.f39290_resource_name_obfuscated_res_0x7f0806cc, R.dimen.f39280_resource_name_obfuscated_res_0x7f0806cb, R.dimen.f39250_resource_name_obfuscated_res_0x7f0806c8);
        this.f = new HG2(applicationContext, R.layout.f60260_resource_name_obfuscated_res_0x7f0e023c, R.dimen.f39520_resource_name_obfuscated_res_0x7f0806e3, R.dimen.f39430_resource_name_obfuscated_res_0x7f0806da, R.dimen.f39420_resource_name_obfuscated_res_0x7f0806d9, R.dimen.f39400_resource_name_obfuscated_res_0x7f0806d7);
        this.g = new HG2(applicationContext, R.layout.f60230_resource_name_obfuscated_res_0x7f0e0239, R.dimen.f39080_resource_name_obfuscated_res_0x7f0806b7, R.dimen.f39080_resource_name_obfuscated_res_0x7f0806b7, 0, 0);
    }

    public final void e(Resources resources, RemoteViews remoteViews, int i, int i2) {
        float f = resources.getDisplayMetrics().density;
        int min = Math.min(i, i2);
        Size size = new Size((int) (((i - min) / 2.0f) * f), (int) (((i2 - min) / 2.0f) * f));
        remoteViews.setViewPadding(R.id.dino_quick_action_area, size.getWidth(), size.getHeight(), size.getWidth(), size.getHeight());
        float min2 = (Math.min(i, i2) * 1.0f) / this.g.b;
        float dimension = resources.getDimension(R.dimen.f39070_resource_name_obfuscated_res_0x7f0806b6) * min2;
        float dimension2 = resources.getDimension(R.dimen.f39060_resource_name_obfuscated_res_0x7f0806b5) * min2;
        float f2 = resources.getConfiguration().getLayoutDirection() == 1 ? 0.0f : dimension2;
        if (!(resources.getConfiguration().getLayoutDirection() == 1)) {
            dimension2 = 0.0f;
        }
        int i3 = (int) dimension;
        remoteViews.setViewPadding(R.id.dino_quick_action_button, (int) f2, i3, (int) dimension2, i3);
        remoteViews.setFloat(R.id.dino_quick_action_text, "setTextSize", (resources.getDimension(R.dimen.f39090_resource_name_obfuscated_res_0x7f0806b8) * min2) / resources.getDisplayMetrics().scaledDensity);
    }

    public final RemoteViews d(Context context, int i) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), i);
        remoteViews.setOnClickPendingIntent(R.id.quick_action_search_widget_search_bar_container, c(context, "org.chromium.chrome.browser.ui.searchactivityutils.ACTION_START_EXTENDED_TEXT_SEARCH"));
        remoteViews.setOnClickPendingIntent(R.id.voice_search_quick_action_button, c(context, "org.chromium.chrome.browser.ui.searchactivityutils.ACTION_START_EXTENDED_VOICE_SEARCH"));
        remoteViews.setOnClickPendingIntent(R.id.incognito_quick_action_button, b(context, this.b));
        remoteViews.setOnClickPendingIntent(R.id.lens_quick_action_button, c(context, "org.chromium.chrome.browser.ui.searchactivityutils.ACTION_START_LENS_SEARCH"));
        remoteViews.setOnClickPendingIntent(R.id.dino_quick_action_button, b(context, this.c));
        return remoteViews;
    }

    public final PendingIntent c(Context context, String str) {
        Intent intent = new Intent(str);
        intent.setComponent(this.a);
        intent.addFlags(268435456);
        AbstractC2281Ro1.a(intent);
        return b(context, intent);
    }

    public static PendingIntent b(Context context, Intent intent) {
        intent.putExtra("org.chromium.chrome.browser.ui.searchactivityutils.FROM_QUICK_ACTION_SEARCH_WIDGET", true);
        return PendingIntent.getActivity(context, 0, intent, AbstractC2281Ro1.d(false) | 134217728);
    }
}
