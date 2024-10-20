package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Process;
import android.text.format.DateFormat;
import android.util.DisplayMetrics;
import android.widget.RemoteViews;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import org.chromium.ui.base.LocalizationUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gc0 */
/* loaded from: classes.dex */
public final class C0791Gc0 extends AbstractC6169i62 {
    public final Context w;

    public C0791Gc0(Context context) {
        super(context.getResources());
        this.w = context;
    }

    @Override // defpackage.AbstractC6169i62
    public final W72 c(C7893n72 c7893n72) {
        boolean z;
        int i;
        int i2;
        RemoteViews remoteViews;
        Context context = this.w;
        RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), R.layout.0_resource_name_obfuscated_res_0x7f0e02ed);
        RemoteViews remoteViews3 = new RemoteViews(context.getPackageName(), R.layout.0_resource_name_obfuscated_res_0x7f0e02ee);
        float f = context.getResources().getConfiguration().fontScale;
        remoteViews3.setInt(R.id.body, "setMaxLines", f > 1.0f ? (int) Math.round(Math.ceil((1.0f / f) * 7.0f)) : 7);
        int a = Ge4.a((f > 1.0f ? (1.3f - Math.min(f, 1.3f)) / 0.29999995f : 1.0f) * 3.0f, context.getResources().getDisplayMetrics());
        C7432ln3 e = C7432ln3.e();
        try {
            String format = DateFormat.getTimeFormat(context).format(new Date());
            e.close();
            boolean z2 = true;
            RemoteViews[] remoteViewsArr = {remoteViews2, remoteViews3};
            int i3 = 0;
            for (int i4 = 2; i3 < i4; i4 = 2) {
                RemoteViews remoteViews4 = remoteViewsArr[i3];
                remoteViews4.setTextViewText(R.id.time, format);
                remoteViews4.setTextViewText(R.id.title, this.d);
                remoteViews4.setTextViewText(R.id.body, this.e);
                remoteViews4.setTextViewText(R.id.origin, this.f);
                remoteViews4.setImageViewBitmap(R.id.icon, f());
                int i5 = i3;
                RemoteViews[] remoteViewsArr2 = remoteViewsArr;
                boolean z3 = z2;
                remoteViews4.setViewPadding(R.id.title, 0, a, 0, 0);
                remoteViews4.setViewPadding(R.id.body_container, 0, a, 0, a);
                Resources resources = context.getResources();
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                int a2 = Ge4.a(16.0f, displayMetrics);
                BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, Bitmap.createBitmap(new int[a2 * a2], a2, a2, Bitmap.Config.ARGB_8888));
                Drawable userBadgedDrawableForDensity = context.getPackageManager().getUserBadgedDrawableForDensity(bitmapDrawable, Process.myUserHandle(), null, displayMetrics.densityDpi);
                if (bitmapDrawable == userBadgedDrawableForDensity || !(userBadgedDrawableForDensity instanceof BitmapDrawable)) {
                    remoteViews = remoteViews4;
                } else {
                    remoteViews = remoteViews4;
                    remoteViews.setImageViewBitmap(R.id.work_profile_badge, ((BitmapDrawable) userBadgedDrawableForDensity).getBitmap());
                    remoteViews.setViewVisibility(R.id.work_profile_badge, 0);
                }
                remoteViews.setViewVisibility(R.id.small_icon_overlay, 0);
                Bitmap bitmap = this.l;
                if (bitmap != null) {
                    remoteViews.setImageViewBitmap(R.id.small_icon_overlay, bitmap);
                } else {
                    remoteViews.setImageViewResource(R.id.small_icon_overlay, this.j);
                }
                i3 = i5 + 1;
                z2 = z3;
                remoteViewsArr = remoteViewsArr2;
            }
            boolean z4 = z2;
            remoteViews3.removeAllViews(R.id.buttons);
            ArrayList arrayList = this.o;
            int i6 = arrayList.isEmpty() ? 8 : 0;
            remoteViews3.setViewVisibility(R.id.button_divider, i6);
            remoteViews3.setViewVisibility(R.id.buttons, i6);
            Resources resources2 = context.getResources();
            DisplayMetrics displayMetrics2 = resources2.getDisplayMetrics();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C5825h62 c5825h62 = (C5825h62) it.next();
                RemoteViews remoteViews5 = new RemoteViews(context.getPackageName(), R.layout.0_resource_name_obfuscated_res_0x7f0e02ef);
                Bitmap bitmap2 = c5825h62.b;
                int i7 = c5825h62.a;
                if (bitmap2 != null || i7 != 0) {
                    remoteViews5.setInt(R.id.button_icon, "setColorFilter", -9079435);
                    Bitmap bitmap3 = c5825h62.b;
                    if (bitmap3 != null) {
                        remoteViews5.setImageViewBitmap(R.id.button_icon, bitmap3);
                        i2 = bitmap3.getWidth();
                    } else if (i7 != 0) {
                        remoteViews5.setImageViewResource(R.id.button_icon, i7);
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = z4;
                        BitmapFactory.decodeResource(resources2, i7, options);
                        i2 = options.outWidth;
                    } else {
                        i2 = 0;
                    }
                    int a3 = Ge4.a(16.0f, displayMetrics2) + Ge4.a(Math.min(Math.round(i2 / (displayMetrics2.densityDpi / 160.0f)), 32), displayMetrics2);
                    remoteViews5.setViewPadding(R.id.button, LocalizationUtils.isLayoutRtl() ? 0 : a3, 0, LocalizationUtils.isLayoutRtl() ? a3 : 0, 0);
                }
                remoteViews5.setTextViewText(R.id.button, c5825h62.c);
                remoteViews5.setOnClickPendingIntent(R.id.button, c5825h62.d.a);
                remoteViews3.addView(R.id.buttons, remoteViews5);
            }
            C5825h62 c5825h622 = this.p;
            if (c5825h622 == null) {
                remoteViews3.setViewVisibility(R.id.origin_settings_icon, 8);
                z = z4;
                i = 0;
                remoteViews3.setViewPadding(R.id.origin, 0, 0, Ge4.b(context, 8.0f), 0);
            } else {
                z = z4;
                i = 0;
                remoteViews3.setOnClickPendingIntent(R.id.origin, c5825h622.d.a);
                remoteViews3.setInt(R.id.origin_settings_icon, "setColorFilter", -9079435);
            }
            PO a4 = X72.a(this.g, c7893n72);
            CharSequence charSequence = this.h;
            K62 k62 = a4.a;
            k62.E.tickerText = K62.c(charSequence);
            a4.f(this.m);
            a4.i(this.n);
            K62 k622 = a4.a;
            k622.k = i;
            k622.g(this.q);
            long[] jArr = this.r;
            if (jArr != null) {
                k622.E.vibrate = jArr;
            }
            k622.F = this.s;
            k622.E.when = this.t;
            k622.l = z;
            k622.h(8, this.u ^ z);
            k622.z = remoteViews2;
            a4.h(this.d);
            a4.g(this.e);
            a4.n(this.f);
            a4.j(f());
            int i8 = this.j;
            Bitmap bitmap4 = this.k;
            if (bitmap4 != null) {
                a4.m(Icon.createWithBitmap(bitmap4));
            } else {
                a4.l(i8);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                AbstractC6169i62.a(a4, (C5825h62) it2.next());
            }
            C5825h62 c5825h623 = this.p;
            if (c5825h623 != null) {
                AbstractC6169i62.a(a4, c5825h623);
            }
            CharSequence charSequence2 = this.f;
            if (charSequence2 != null) {
                k62.r = "Web:" + ((Object) charSequence2);
            }
            k622.y = d(context);
            k622.A = remoteViews3;
            return new W72(k622.b(), a4.b);
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}
