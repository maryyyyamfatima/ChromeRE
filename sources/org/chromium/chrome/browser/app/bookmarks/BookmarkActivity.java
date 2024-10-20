package org.chromium.chrome.browser.app.bookmarks;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import defpackage.AbstractActivityC0159Bf3;
import defpackage.AbstractC2281Ro1;
import defpackage.C8252oA;
import defpackage.C8490os;
import defpackage.InterfaceC8146ns;
import java.util.Objects;
import org.chromium.components.bookmarks.BookmarkId;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class BookmarkActivity extends AbstractActivityC0159Bf3 {
    public C8252oA C;

    @Override // defpackage.AbstractActivityC0159Bf3, defpackage.AbstractActivityC4038bu3, defpackage.LM, defpackage.VS0, defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.C = new C8252oA(this, (ComponentName) AbstractC2281Ro1.s(getIntent(), "org.chromium.chrome.browser.parent_component"), true, AbstractC2281Ro1.j(getIntent(), "org.chromium.chrome.browser.incognito_mode", false), this.B);
        String dataString = getIntent().getDataString();
        if (TextUtils.isEmpty(dataString)) {
            dataString = "chrome-native://bookmarks/";
        }
        this.C.j(dataString);
        setContentView(this.C.h);
        final C8252oA c8252oA = this.C;
        Objects.requireNonNull(c8252oA);
        C8490os.a(this, this.l, new InterfaceC8146ns() { // from class: Gz
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException
                */
            @Override // defpackage.InterfaceC8146ns
            public final boolean onBackPressed() {
                /*
                    r6 = this;
                    oA r0 = defpackage.C8252oA.this
                    boolean r1 = r0.w
                    r2 = 0
                    if (r1 == 0) goto L8
                    goto L43
                L8:
                    org.chromium.components.browser_ui.widget.selectable_list.SelectableListLayout r1 = r0.m
                    c33 r3 = r1.m
                    m33 r3 = r3.a0
                    boolean r4 = r3.e()
                    r5 = 1
                    if (r4 == 0) goto L1a
                    r3.b()
                L18:
                    r1 = r5
                    goto L25
                L1a:
                    c33 r1 = r1.m
                    boolean r3 = r1.b0
                    if (r3 == 0) goto L24
                    r1.I()
                    goto L18
                L24:
                    r1 = r2
                L25:
                    if (r1 == 0) goto L28
                    goto L42
                L28:
                    java.util.Stack r1 = r0.q
                    boolean r3 = r1.empty()
                    if (r3 != 0) goto L43
                    r1.pop()
                    boolean r3 = r1.empty()
                    if (r3 != 0) goto L43
                    java.lang.Object r1 = r1.pop()
                    QA r1 = (defpackage.QA) r1
                    r0.h(r1)
                L42:
                    r2 = r5
                L43:
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.C0905Gz.onBackPressed():boolean");
            }
        });
    }

    @Override // defpackage.LM, androidx.appcompat.app.a, defpackage.VS0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.C.e();
    }

    @Override // defpackage.VS0, defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 14 && i2 == -1) {
            this.C.f(BookmarkId.a(intent.getStringExtra("BookmarkEditActivity.VisitBookmarkId")));
        }
    }
}
