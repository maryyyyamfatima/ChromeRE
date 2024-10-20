package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11907yq extends LinearLayout {
    public C11907yq(Context context, ArrayList arrayList, C5734gr c5734gr) {
        super(context);
        setOrientation(1);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            addView(new ViewOnClickListenerC11221wq(context, (AbstractC7127ku0) it.next(), c5734gr));
        }
    }
}
