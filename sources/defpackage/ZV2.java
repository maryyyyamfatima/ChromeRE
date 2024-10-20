package defpackage;

import J.N;
import android.app.Activity;
import android.os.Handler;
import android.util.Size;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.chrome.browser.content_creation.reactions.scene.ReactionLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ZV2 implements InterfaceC3553aW2, UQ3 {
    public final Activity a;
    public final C10316uB1 b;
    public final int f;
    public ReactionLayout g;
    public RelativeLayout h;
    public ImageView i;
    public ZN3 j;
    public final HashSet c = new HashSet();
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public int k = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;

    public ZV2(Activity activity, C10316uB1 c10316uB1) {
        this.a = activity;
        this.b = c10316uB1;
        C7928nE c7928nE = UN.a;
        this.f = N.M37SqSAy("LightweightReactions", "max_reactions", 10);
    }

    public final int a() {
        HashSet hashSet = this.c;
        if (hashSet.size() == 0) {
            return 1;
        }
        return ((ReactionLayout) Collections.max(hashSet, new XV2())).k.f0.e;
    }

    public final Size b() {
        float[] fArr = new float[9];
        this.i.getImageMatrix().getValues(fArr);
        return new Size(Math.round(this.i.getDrawable().getIntrinsicWidth() * fArr[0]), Math.round(this.i.getDrawable().getIntrinsicHeight() * fArr[4]));
    }

    public final void f() {
        ZN3 zn3 = this.j;
        if (zn3 != null) {
            zn3.a();
        }
        Object[] objArr = {Integer.valueOf(this.f)};
        Activity activity = this.a;
        ZN3 c = ZN3.c(activity, activity.getString(R.string.f76280_resource_name_obfuscated_res_0x7f1405bb, objArr), 0);
        this.j = c;
        c.d();
    }

    public final void c(ReactionLayout reactionLayout, boolean z) {
        if (z) {
            ReactionLayout reactionLayout2 = this.g;
            if (reactionLayout2 != null) {
                reactionLayout2.b(false);
            }
            reactionLayout.b(true);
            this.g = reactionLayout;
            reactionLayout.bringToFront();
            return;
        }
        ReactionLayout reactionLayout3 = this.g;
        if (reactionLayout3 != null) {
            reactionLayout3.b(false);
            this.g = null;
        }
    }

    public final void e(ReactionLayout reactionLayout) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ReactionLayout reactionLayout2 = (ReactionLayout) it.next();
            if (reactionLayout2 != reactionLayout) {
                C9661sH2 c9661sH2 = reactionLayout2.k;
                c9661sH2.getClass();
                Handler handler = RunnableC4383cv.e0;
                handler.sendMessage(handler.obtainMessage(12, c9661sH2));
            }
        }
    }

    public final void d(ReactionLayout reactionLayout) {
        Integer num = (Integer) this.d.remove(reactionLayout);
        if (num != null) {
            this.e.set(num.intValue(), Integer.valueOf(((Integer) r0.get(num.intValue())).intValue() - 1));
        }
    }
}
