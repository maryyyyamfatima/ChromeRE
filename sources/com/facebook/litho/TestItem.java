package com.facebook.litho;

import android.graphics.Rect;
import defpackage.AbstractC10250u00;
import java.util.Collections;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class TestItem {
    public String a;
    public ComponentHost c;
    public Object d;
    public final Rect b = new Rect();
    public final AcquireKey e = new AcquireKey();

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public final class AcquireKey {
    }

    public String getTestKey() {
        return this.a;
    }

    public Rect getBounds() {
        return this.b;
    }

    public ComponentHost getHost() {
        return this.c;
    }

    public String getTextContent() {
        List textItems = AbstractC10250u00.a(Collections.singletonList(this.d)).getTextItems();
        StringBuilder sb = new StringBuilder();
        int size = textItems.size();
        for (int i = 0; i < size; i++) {
            sb.append((CharSequence) textItems.get(i));
        }
        return sb.toString();
    }

    public AcquireKey getAcquireKey() {
        return this.e;
    }
}
