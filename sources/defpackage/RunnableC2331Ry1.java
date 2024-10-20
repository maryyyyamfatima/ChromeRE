package defpackage;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ry1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2331Ry1 implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ int g = R.dimen.f40580_resource_name_obfuscated_res_0x7f080753;
    public final /* synthetic */ int h = 0;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ View k;

    public /* synthetic */ RunnableC2331Ry1(int i, int i2, View view, View view2) {
        this.a = view;
        this.i = i;
        this.j = i2;
        this.k = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Rect rect = new Rect();
        View view = this.a;
        view.getHitRect(rect);
        rect.top -= this.g;
        rect.left -= this.h;
        rect.right += this.i;
        rect.bottom += this.j;
        this.k.setTouchDelegate(new TouchDelegate(rect, view));
    }
}
