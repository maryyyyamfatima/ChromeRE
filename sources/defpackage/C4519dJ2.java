package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dJ2 */
/* loaded from: classes.dex */
public final class C4519dJ2 extends OK2 {
    public final /* synthetic */ AbstractC12077zK2 f;
    public final /* synthetic */ KJ2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4519dJ2(KJ2 kj2, RecyclerView recyclerView, AbstractC12077zK2 abstractC12077zK2) {
        super(recyclerView);
        this.g = kj2;
        this.f = abstractC12077zK2;
    }

    @Override // defpackage.OK2, defpackage.O0
    public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        ArrayList arrayList;
        super.d(view, accessibilityNodeInfoCompat);
        KJ2 kj2 = this.g;
        synchronized (kj2) {
            arrayList = kj2.a;
        }
        int size = arrayList.size();
        int i = this.f.f() ? size : 1;
        if (!this.f.e()) {
            size = 1;
        }
        accessibilityNodeInfoCompat.a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i, size, false, 0));
    }
}
