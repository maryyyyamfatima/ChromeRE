package defpackage;

import android.app.RemoteAction;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.LocaleList;
import android.view.View;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;
import android.view.textclassifier.TextSelection$Request$Builder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gf3 */
/* loaded from: classes2.dex */
public final class C5666gf3 extends AbstractC0185Bl {
    public final TextClassifier h;
    public final int i;
    public final CharSequence j;
    public final int k;
    public final int l;
    public final Context m;
    public final /* synthetic */ C6010hf3 n;

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        this.n.a.a((C5808h33) obj);
    }

    public C5666gf3(C6010hf3 c6010hf3, TextClassifier textClassifier, int i, CharSequence charSequence, int i2, int i3, Context context) {
        this.n = c6010hf3;
        this.h = textClassifier;
        this.i = i;
        this.j = charSequence;
        this.k = i2;
        this.l = i3;
        this.m = context;
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        TextSelection textSelection;
        LocaleList adjustedDefault;
        LocaleList adjustedDefault2;
        TextSelection suggestSelection;
        int selectionStartIndex;
        int selectionEndIndex;
        TextClassification textClassification;
        LocaleList adjustedDefault3;
        TextSelection$Request$Builder defaultLocales;
        TextSelection$Request$Builder includeTextClassification;
        TextSelection.Request build;
        try {
            int i = this.i;
            TextClassifier textClassifier = this.h;
            CharSequence charSequence = this.j;
            int i2 = this.k;
            int i3 = this.l;
            TextClassification textClassification2 = null;
            if (i == 1) {
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 31) {
                    TextSelection$Request$Builder a = AbstractC4625de.a(charSequence, i2, i3);
                    adjustedDefault3 = LocaleList.getAdjustedDefault();
                    defaultLocales = a.setDefaultLocales(adjustedDefault3);
                    includeTextClassification = defaultLocales.setIncludeTextClassification(true);
                    build = includeTextClassification.build();
                    suggestSelection = textClassifier.suggestSelection(build);
                } else {
                    adjustedDefault2 = LocaleList.getAdjustedDefault();
                    suggestSelection = textClassifier.suggestSelection(charSequence, i2, i3, adjustedDefault2);
                }
                selectionStartIndex = suggestSelection.getSelectionStartIndex();
                int max = Math.max(0, selectionStartIndex);
                int length = charSequence.length();
                selectionEndIndex = suggestSelection.getSelectionEndIndex();
                int min = Math.min(length, selectionEndIndex);
                if (h()) {
                    return new C5808h33();
                }
                if (i4 >= 31) {
                    textClassification = suggestSelection.getTextClassification();
                    textClassification2 = textClassification;
                }
                textSelection = suggestSelection;
                i2 = max;
                i3 = min;
            } else {
                textSelection = null;
            }
            if (textClassification2 == null) {
                adjustedDefault = LocaleList.getAdjustedDefault();
                textClassification2 = textClassifier.classifyText(charSequence, i2, i3, adjustedDefault);
            }
            return n(i2, i3, textClassification2, textSelection);
        } catch (IllegalStateException e) {
            AbstractC4851eH1.a("SmartSelProvider", "Failed to use text classifier for smart selection", e);
            return new C5808h33();
        }
    }

    public final C5808h33 n(int i, int i2, TextClassification textClassification, TextSelection textSelection) {
        CharSequence label;
        Drawable icon;
        Intent intent;
        View.OnClickListener onClickListener;
        ArrayList arrayList;
        List actions;
        Icon icon2;
        C5808h33 c5808h33 = new C5808h33();
        c5808h33.a = i - this.k;
        c5808h33.b = i2 - this.l;
        label = textClassification.getLabel();
        c5808h33.c = label;
        icon = textClassification.getIcon();
        c5808h33.d = icon;
        intent = textClassification.getIntent();
        c5808h33.e = intent;
        onClickListener = textClassification.getOnClickListener();
        c5808h33.f = onClickListener;
        c5808h33.h = textSelection;
        c5808h33.g = textClassification;
        if (Build.VERSION.SDK_INT >= 28) {
            Context context = this.m;
            if (context != null) {
                arrayList = new ArrayList();
                actions = textClassification.getActions();
                Iterator it = actions.iterator();
                while (it.hasNext()) {
                    icon2 = ((RemoteAction) it.next()).getIcon();
                    arrayList.add(icon2.loadDrawable(context));
                }
            } else {
                arrayList = null;
            }
            c5808h33.i = arrayList;
        }
        return c5808h33;
    }
}
