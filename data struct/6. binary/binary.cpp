#include <stdio.h>

class Node{
    public:
    int data;
    Node *left,*right;
    Node(int a){
        data = a;
        left = NULL;
        right = NULL;
    }
};

class queue{
    public:
    Node *arr[50];
    int n = 0,head = 0,tail = 0;
    void push(Node *a){
        if(n >= 50){
            return;
        }
        n++;
        arr[tail++] = a;
        if(tail >= 50){
            tail = 0;
        }
    }

    void pop(){
        if(n <= 0){
            return;
        }
        n--;
        head++;
        if(head >= 50){
            head = 0;
        }
    }
    
};

class bst{
    public:
    Node *root;
    bst(){
        root = NULL;
    }

    void insert(int a){
        if(root == NULL){
            root = new Node(a);
            return;
        }

        Node *i = root;
        while (true)
        {
            if(i->data > a && i->left != NULL){
                i = i->left;
            }else if(i->data < a && i->right != NULL){
                i = i->right;
            }else if(i->data > a && i->left == NULL){
                i->left = new Node(a);
                break;
            }else if(i->data < a && i->right == NULL){
                i->right = new Node(a);
                break;
            }else{
                break;
            }
        }
        
    }
    
    void deleteNodeChild(Node *a){
        Node *swap = findSwapSuc(a);
        int s = swap->data;
        deleteNode(s);
        a->data = s;
        return;
    }

    void deleteNode(int a){
        if(root->data == a){
            if(checkBothChild(root)){
                deleteNodeChild(root);
                return;
            }else if(checkLeft(root)){
                root = root->left;
                return;
            }else if(checkRight(root)){
                root = root->right;
                return;
            }else{
                root = NULL;
                return;
            }
        }

        Node *r = root;
        while (true)
        {
            if(r->data > a && r->left != NULL){
                Node *c = r->left;
                if(c->data == a){
                    if(checkBothChild(c)){
                        deleteNodeChild(c);
                        return;
                    }else if(checkLeft(c)){
                        r->left = c->left;
                        return;
                    }else if(checkRight(c)){
                        r->left = c->right;
                        return;
                    }else{
                        r->left = NULL;
                        return;
                    }
                }else{
                    r = r->left;
                }
            }else if(r->data < a && r->right != NULL){
                Node *c = r->right;
                if(c->data == a){
                    if(checkBothChild(c)){
                        deleteNodeChild(c);
                        return;
                    }else if(checkLeft(c)){
                        r->right = c->left;
                        return;
                    }else if(checkRight(c)){
                        r->right = c->right;
                        return;
                    }else{
                        r->right = NULL;
                        return;
                    }
                }else{
                    r = r->right;
                }
            }else{
                return;
            }
        }
        

    }

    bool checkBothChild(Node *i){
        return (i->left != NULL) && (i->right != NULL);
    }
    bool checkLeft(Node *i){
        return i->left!=NULL;
    }
    bool checkRight(Node *i){
        return i->right !=NULL;
    }

    Node *findSwapPre(Node *j){ //predecessors
        Node *i = j;
        i = i->left;
        while (i->right != NULL)
        {
            i = i->right;
        }
        return i;
    }

    Node *findSwapSuc(Node *j){ //predecessors
        Node *i = j;
        i = i->right;
        while (i->left != NULL)
        {
            i = i->left;
        }
        return i;
    }

    int findHeight(Node *i){
        int temp1,temp2;
        if(!checkLeft(i) && !checkRight(i)){
            return 0;
        }
        if(checkBothChild(i)){
            temp1 = findHeight(i->left);
            temp2 = findHeight(i->right);
            if (temp1 > temp2)
            {
                return temp1+1;
            }else{
                return temp2+1;
            }
        }

        if(checkLeft(i)){
            return 1+findHeight(i->left);
        }

        return 1+findHeight(i->right);
    }

    void breadthFast(){
        int n = findHeight(root);
        for(int i = 0;i<=n;i++){
            printLevel(root,i);
            printf("|");
        }
    }

    void printLevel(Node *i,int n){
        if(n == 0){
            printf("%d,",i->data);
        }else{
            if(checkLeft(i)){
                printLevel(i->left,n-1);
            }
            if(checkRight(i)){
                printLevel(i->right,n-1);
            }
        }
    }

    void preorder(Node *r){
        if(r == NULL){
            return;
        }
        printf("%d,",r->data);
        preorder(r->left);
        preorder(r->right);
    }

    void postorder(Node *r){
        if(r == NULL){
            return;
        }
        postorder(r->left);
        postorder(r->right);
        printf("%d,",r->data);
    }

    void inorder(Node *r){
        if(r == NULL){
            return;
        }
        inorder(r->left);
        printf("%d,",r->data);
        inorder(r->right);
    }

};

int main(){
    bst b;
    char mode;
    int a;
    bool loop = true;
    while (loop)
    {
        scanf("%c",&mode);
        switch (mode)
        {
        case 'a':
            scanf("%d",&a);
            b.insert(a);
            break;
        case 'd':
            scanf("%d",&a);
            b.deleteNode(a);
            break;
        case 'b':
            b.breadthFast();
            printf("\n");
            break;
        case 'i':
            b.inorder(b.root);
            printf("\n");
            break;
        case 'p':
            b.preorder(b.root);
            printf("\n");
            break;
        case 't':
            b.postorder(b.root);
            printf("\n");
            break;
        case 'x':
            loop = false;
        default:
            break;
        }
    }
    
}