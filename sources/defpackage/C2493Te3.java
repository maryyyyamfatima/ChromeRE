package defpackage;

import android.content.Context;
import android.view.textclassifier.SelectionEvent;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassificationContext$Builder;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Te3 */
/* loaded from: classes2.dex */
public final class C2493Te3 implements InterfaceC7870n33 {
    public WindowAndroid a;
    public TextClassifier b;
    public C8214o33 c;

    public C2493Te3(WebContents webContents) {
        this.a = webContents.Q0();
        C10191tp4 e = C10191tp4.e(webContents);
        if (e != null) {
            e.b(new C2363Se3(this));
        }
    }

    public final void e(String str, int i, boolean z) {
        Context context;
        WindowAndroid windowAndroid = this.a;
        if (windowAndroid == null || (context = (Context) windowAndroid.j.get()) == null) {
            return;
        }
        this.b = ((TextClassificationManager) context.getSystemService("textclassification")).createTextClassificationSession(new TextClassificationContext$Builder(context.getPackageName(), z ? "edit-webview" : "webview").build());
        C8214o33 c8214o33 = new C8214o33();
        this.c = c8214o33;
        c8214o33.c(i, str);
        this.c.e = i;
        b(SelectionEvent.createSelectionStartedEvent(1, 0));
    }

    public final void d(String str, int i, C5808h33 c5808h33) {
        SelectionEvent createSelectionModifiedEvent;
        TextClassification textClassification;
        SelectionEvent createSelectionModifiedEvent2;
        TextSelection textSelection;
        SelectionEvent createSelectionModifiedEvent3;
        if (this.b == null) {
            return;
        }
        if (!this.c.c(i, str)) {
            a();
            return;
        }
        int[] iArr = new int[2];
        if (!this.c.a(i, str.length() + i, iArr)) {
            a();
            return;
        }
        if (c5808h33 != null && (textSelection = c5808h33.h) != null) {
            createSelectionModifiedEvent3 = SelectionEvent.createSelectionModifiedEvent(iArr[0], iArr[1], textSelection);
            b(createSelectionModifiedEvent3);
        } else if (c5808h33 != null && (textClassification = c5808h33.g) != null) {
            createSelectionModifiedEvent2 = SelectionEvent.createSelectionModifiedEvent(iArr[0], iArr[1], textClassification);
            b(createSelectionModifiedEvent2);
        } else {
            createSelectionModifiedEvent = SelectionEvent.createSelectionModifiedEvent(iArr[0], iArr[1]);
            b(createSelectionModifiedEvent);
        }
    }

    public final void c(String str, int i, int i2, C5808h33 c5808h33) {
        SelectionEvent createSelectionActionEvent;
        boolean isTerminal;
        TextClassification textClassification;
        SelectionEvent createSelectionActionEvent2;
        if (this.b == null) {
            return;
        }
        if (!this.c.c(i, str)) {
            a();
            return;
        }
        int[] iArr = new int[2];
        if (!this.c.a(i, str.length() + i, iArr)) {
            a();
            return;
        }
        if (c5808h33 != null && (textClassification = c5808h33.g) != null) {
            createSelectionActionEvent2 = SelectionEvent.createSelectionActionEvent(iArr[0], iArr[1], i2, textClassification);
            b(createSelectionActionEvent2);
        } else {
            createSelectionActionEvent = SelectionEvent.createSelectionActionEvent(iArr[0], iArr[1], i2);
            b(createSelectionActionEvent);
        }
        isTerminal = SelectionEvent.isTerminal(i2);
        if (isTerminal) {
            a();
        }
    }

    public final void a() {
        boolean isDestroyed;
        TextClassifier textClassifier = this.b;
        if (textClassifier != null) {
            isDestroyed = textClassifier.isDestroyed();
            if (isDestroyed) {
                return;
            }
            this.b.destroy();
            this.b = null;
        }
    }

    public final void b(SelectionEvent selectionEvent) {
        this.b.onSelectionEvent(selectionEvent);
    }
}
