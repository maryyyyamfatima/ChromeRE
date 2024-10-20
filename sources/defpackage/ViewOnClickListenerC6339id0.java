package defpackage;

import android.content.Intent;
import android.view.View;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: id0 */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC6339id0 implements View.OnClickListener {
    public final /* synthetic */ C8057nd0 a;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C8057nd0 c8057nd0 = this.a;
        if (c8057nd0.o == null) {
            return;
        }
        Intent intent = new Intent();
        int id = view.getId();
        if (UN.g.a()) {
            id = ((Integer) view.getTag(R.id.view_id_tag_key)).intValue();
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_CLICKED_ID", id);
        C8057nd0.d(c8057nd0.o, intent, c8057nd0.a, c8057nd0.k);
    }

    public ViewOnClickListenerC6339id0(C8057nd0 c8057nd0) {
        this.a = c8057nd0;
    }
}
