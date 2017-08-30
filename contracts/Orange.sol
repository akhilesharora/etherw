pragma solidity ^0.4.2;


contract Orange{

    Store[] public dir;

    struct Store{
        bytes32 hash;
        bytes32 meta;
    }

    function addData(bytes32 _hash, bytes32 _meta) returns (bool success){
        Store memory newStore;
        newStore.hash = _hash;
        newStore.meta = _meta;

        dir.push(newStore);
        return true;
    }

    function getData() constant returns(bytes32[],bytes32[]){

        uint length = dir.length;


        bytes32[] memory hashes = new bytes32[](length);
        bytes32[] memory metas = new bytes32[](length);

        for(uint i=0; i< dir.length; i++){
            Store memory currentDir;

            currentDir = dir[i];

            hashes[i] = currentDir.hash;
            metas[i] = currentDir.meta;

        }

        return (hashes,metas);
    }

    function searchData(bytes32 _hashInput) constant returns(bytes32[],bytes32[]){

        uint length = dir.length;


        bytes32[] memory hashes = new bytes32[](length);
        bytes32[] memory metas = new bytes32[](length);

        for(uint i=0; i< dir.length; i++){
            Store memory currentDir;

            currentDir = dir[i];
            if (_hashInput == currentDir.hash){
                hashes[i] = currentDir.hash;
                metas[i] = currentDir.meta;
                break;
            }

        }

        return (hashes,metas);
    }

}