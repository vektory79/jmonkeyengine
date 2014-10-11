//uniform mat4 g_WorldViewProjectionMatrix;
//uniform mat4 g_WorldMatrix;
//uniform mat4 g_WorldMatrixInverse;
//uniform mat3 g_NormalMatrix;
//uniform mat4 g_ViewMatrix;
//uniform mat4 g_WorldViewNatrix;

in vec3 inPosition;
in vec3 inNormal;
in vec2 inTexCoord;

out VertexData {
    vec3 Position;
    vec3 Normal;
    vec2 TexCoord;
} VertexOut;


void main() { 
    VertexOut.Position = inPosition;
    VertexOut.Normal = inNormal;
    VertexOut.TexCoord = inTexCoord;
}