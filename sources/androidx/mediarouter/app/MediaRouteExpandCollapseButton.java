package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.android.chrome.R;
import defpackage.C1844Of;
import defpackage.Y50;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class MediaRouteExpandCollapseButton extends C1844Of {
    public final AnimationDrawable i;
    public final AnimationDrawable j;
    public final String k;
    public final String l;
    public boolean m;
    public View.OnClickListener n;

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Object obj = Y50.a;
        AnimationDrawable animationDrawable = (AnimationDrawable) context.getDrawable(R.drawable.f51460_resource_name_obfuscated_res_0x7f0903ae);
        this.i = animationDrawable;
        AnimationDrawable animationDrawable2 = (AnimationDrawable) context.getDrawable(R.drawable.f51450_resource_name_obfuscated_res_0x7f0903ad);
        this.j = animationDrawable2;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(f.c(context), PorterDuff.Mode.SRC_IN);
        animationDrawable.setColorFilter(porterDuffColorFilter);
        animationDrawable2.setColorFilter(porterDuffColorFilter);
        String string = context.getString(R.string.f77910_resource_name_obfuscated_res_0x7f14067c);
        this.k = string;
        this.l = context.getString(R.string.f77890_resource_name_obfuscated_res_0x7f14067a);
        setImageDrawable(animationDrawable.getFrame(0));
        setContentDescription(string);
        super.setOnClickListener(new e(this));
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.n = onClickListener;
    }
}
