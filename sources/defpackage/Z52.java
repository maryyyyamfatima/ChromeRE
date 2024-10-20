package defpackage;

import org.chromium.components.content_creation.notes.models.NoteTemplate;
import org.chromium.components.content_creation.notes.models.TextStyle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Z52 {
    public final NoteTemplate a;
    public final IZ3 b;

    public Z52(NoteTemplate noteTemplate) {
        this.a = noteTemplate;
        TextStyle textStyle = noteTemplate.d;
        this.b = new IZ3(textStyle.a, textStyle.b);
    }
}
