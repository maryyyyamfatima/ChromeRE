package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.components.page_info.ElidedUrlTextView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gg2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0813Gg2 extends FrameLayout {
    public ElidedUrlTextView a;
    public TextView g;
    public final ViewGroup h;
    public final ViewGroup i;
    public View j;
    public final View k;
    public final TextView l;

    public C0813Gg2(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.f59280_resource_name_obfuscated_res_0x7f0e01d4, (ViewGroup) this, true);
        this.h = (ViewGroup) findViewById(R.id.page_info_wrapper);
        this.i = (ViewGroup) findViewById(R.id.page_info_content);
        this.k = findViewById(R.id.page_info_subpage_header);
        this.l = (TextView) findViewById(R.id.page_info_subpage_title);
    }

    public final void b(final View view, final String str, final RunnableC1982Pg2 runnableC1982Pg2) {
        if (this.j == null) {
            a(str, view);
        } else {
            this.h.animate().setDuration(90L).alpha(0.0f).setInterpolator(new AccelerateInterpolator()).withEndAction(new Runnable() { // from class: Ag2
                @Override // java.lang.Runnable
                public final void run() {
                    C0813Gg2 c0813Gg2 = C0813Gg2.this;
                    c0813Gg2.a(str, view);
                    ViewGroup viewGroup = c0813Gg2.h;
                    viewGroup.setScaleX(0.92f);
                    viewGroup.setScaleY(0.92f);
                    viewGroup.setAlpha(0.0f);
                    viewGroup.animate().setDuration(210L).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setInterpolator(new DecelerateInterpolator()).withEndAction(runnableC1982Pg2);
                }
            });
        }
    }

    public final void a(CharSequence charSequence, View view) {
        ViewGroup viewGroup = this.i;
        viewGroup.removeAllViews();
        this.j = view;
        this.k.setVisibility(charSequence != null ? 0 : 8);
        this.l.setText(charSequence);
        viewGroup.addView(view);
        if (charSequence == null) {
            charSequence = getResources().getString(R.string.f66730_resource_name_obfuscated_res_0x7f140193);
        }
        announceForAccessibility(charSequence);
    }
}
