package defpackage;

import android.R;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pt4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8844pt4 extends FrameLayout {
    public final ProgressBar a;
    public final TextView g;

    public C8844pt4(VS0 vs0) {
        super(vs0);
        Resources resources = vs0.getResources();
        Locale locale = (resources == null || resources.getConfiguration() == null || resources.getConfiguration().locale == null) ? Locale.getDefault() : resources.getConfiguration().locale;
        HashMap hashMap = new HashMap();
        hashMap.put("error_initializing_player", "An error occurred while initializing the YouTube player.");
        hashMap.put("get_youtube_app_title", "Get YouTube App");
        hashMap.put("get_youtube_app_text", "This app won't run without the YouTube App, which is missing from your device");
        hashMap.put("get_youtube_app_action", "Get YouTube App");
        hashMap.put("enable_youtube_app_title", "Enable YouTube App");
        hashMap.put("enable_youtube_app_text", "This app won't work unless you enable the YouTube App.");
        hashMap.put("enable_youtube_app_action", "Enable YouTube App");
        hashMap.put("update_youtube_app_title", "Update YouTube App");
        hashMap.put("update_youtube_app_text", "This app won't work unless you update the YouTube App.");
        hashMap.put("update_youtube_app_action", "Update YouTube App");
        Nu4.a(hashMap, locale.getLanguage());
        String language = locale.getLanguage();
        String country = locale.getCountry();
        StringBuilder sb = new StringBuilder(String.valueOf(language).length() + 1 + String.valueOf(country).length());
        sb.append(language);
        sb.append("_");
        sb.append(country);
        Nu4.a(hashMap, sb.toString());
        String str = (String) hashMap.get("error_initializing_player");
        setBackgroundColor(-16777216);
        ProgressBar progressBar = new ProgressBar(vs0);
        this.a = progressBar;
        progressBar.getIndeterminateDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_IN);
        progressBar.setVisibility(8);
        addView(progressBar, new FrameLayout.LayoutParams(-2, -2, 17));
        int i = (int) ((vs0.getResources().getDisplayMetrics().density * 10.0f) + 0.5f);
        TextView textView = new TextView(vs0);
        this.g = textView;
        textView.setTextAppearance(vs0, R.style.TextAppearance.Small);
        textView.setTextColor(-1);
        textView.setVisibility(8);
        textView.setPadding(i, i, i, i);
        textView.setGravity(17);
        textView.setText(str);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (mode == 1073741824 || (mode == Integer.MIN_VALUE && mode2 == 0)) {
                size2 = (int) (size / 1.777f);
            } else {
                if (mode2 == 1073741824 || (mode2 == Integer.MIN_VALUE && mode == 0)) {
                    f = size2;
                } else if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
                    f = size2;
                    float f2 = size / 1.777f;
                    if (f >= f2) {
                        size2 = (int) f2;
                    }
                } else {
                    size = 0;
                    size2 = 0;
                }
                size = (int) (f * 1.777f);
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.resolveSize(size, i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.resolveSize(size2, i2), 1073741824));
    }
}
